using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace EasyTravelApp
{
    public partial class FormMainMenu : Form
    {
        public DataTable userdata = null;
        SqlConnection con = new SqlConnection("Data Source=DESKTOP-TE4O5CH;Initial Catalog=51th0914;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
        public FormMainMenu()
        {
            InitializeComponent();
        }

        public DataTable sql(string str)
        {
            SqlDataAdapter dataAdapter = new SqlDataAdapter(str, con);
            DataTable table = new();
            dataAdapter.Fill(table);
            return table;
        }

        public void buttonVisible(string controlName,bool booling)
        {
            Control[] ctl = this.Controls.Find(controlName, true);
            ((Button)ctl[0]).Visible = booling;
        }

        public void setView(UserControl userControl)
        {   
            panelView.Controls.Clear();
            panelView.Controls.Add(userControl);
            userControl.Dock = DockStyle.Fill;
            userControl.AutoScroll = true;
        }

        public void setMain()
        {
            UserControlMain userControl = new UserControlMain(this);

            panelView.Controls.Add(userControl);

            userControl.Dock = DockStyle.Fill;
            userControl.AutoScroll = true;
            

        }
        
        private void FormMainMenu_Load(object sender, EventArgs e)
        {
            foreach (Button btn in panelMenu.Controls.OfType<Button>())
            {
                btn.Visible = false;
            }

            buttonHome.Visible = true;
            buttonLogin.Visible = true;

            setView(new UserControlMain(this));
        }

        private void buttonHome_Click(object sender, EventArgs e)
        {
            setView(new UserControlMain(this));
        }

        private void buttonLogin_Click(object sender, EventArgs e)
        {
            setView(new UserControlLogin(this));
        }

        private void buttonUserLoginData_Click(object sender, EventArgs e)
        {
            setView(new UserControlUserLoginData(this));
        }

        private void buttonLogout_Click(object sender, EventArgs e)
        {
            foreach (Button btn in panelMenu.Controls.OfType<Button>())
            {
                btn.Visible = false;
            }

            buttonHome.Visible = true;
            buttonLogin.Visible = true;

            setMain();
            sql($"insert into [userLoginData] values('{userdata.Rows[0]["userId"]}','{DateTime.Now}','Logout')");
            userdata = null;
        }

        private void FormMainMenu_FormClosing(object sender, FormClosingEventArgs e)
        {
            if(userdata != null)
            {
                sql($"insert into [userLoginData] values('{userdata.Rows[0]["userId"]}','{DateTime.Now}','Logout')");
                userdata = null;
            }
        }
    }
}

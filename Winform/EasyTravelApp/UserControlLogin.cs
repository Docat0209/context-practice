using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace EasyTravelApp
{
    public partial class UserControlLogin : UserControl
    {
        FormMainMenu _menu;
        DataTable data = new();
        public UserControlLogin(FormMainMenu menu)
        {
            InitializeComponent();
            _menu = menu;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            data = _menu.sql($"select * from [user] where account = '{textBoxAccount.Text}' and password = '{textBoxPassword.Text}'");
            if(data.Rows.Count == 1)
            {
                if(int.Parse(data.Rows[0]["loginFalse"].ToString()) >= 3)
                {
                    MessageBox.Show("This Account is locked");
                }
                else
                {
                    _menu.buttonVisible("buttonLogin", false);
                    _menu.buttonVisible("buttonLogout", true);
                    _menu.setMain();
                    _menu.sql($"insert into [userLoginData] values('{data.Rows[0]["userId"]}','{DateTime.Now}','Login')");
                    _menu.userdata = data;
                    switch (int.Parse(data.Rows[0]["permissionId"].ToString()))
                    {
                        case 1:
                            _menu.buttonVisible("buttonUserLoginData", true);
                            break;

                    }
                }
                    
            }
            else
            {
                _menu.sql($"update [user] set loginFalse = {int.Parse(data.Rows[0]["loginFalse"].ToString())} +1");
                MessageBox.Show("Login False try again");
            }
        }
    }
}

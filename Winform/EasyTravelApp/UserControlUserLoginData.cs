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
    public partial class UserControlUserLoginData : UserControl
    {
        FormMainMenu _menu;
        public UserControlUserLoginData(FormMainMenu menu)
        {
            InitializeComponent();
            _menu = menu;
        }

        private void UserControlUserLoginData_Load(object sender, EventArgs e)
        {
            dataGridView1.DataSource = _menu.sql($"select * from [userLoginData]");
        }
    }
}

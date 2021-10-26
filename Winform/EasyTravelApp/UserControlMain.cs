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
    public partial class UserControlMain : UserControl
    {
        FormMainMenu _Menu;
        public UserControlMain(FormMainMenu menu)
        {
            InitializeComponent();
            _Menu = menu;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            _Menu.setView(new UserControlViewPoint(_Menu));
        }

        private void button2_Click(object sender, EventArgs e)
        {
            _Menu.setView(new UserControlPopular(_Menu));
        }

        private void button3_Click(object sender, EventArgs e)
        {
            _Menu.setView(new UserControlTravelWay(_Menu));
        }

        private void button4_Click(object sender, EventArgs e)
        {
            _Menu.setView(new UserControlTicket(_Menu));
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void UserControlMain_Load(object sender, EventArgs e)
        {

        }
    }
}

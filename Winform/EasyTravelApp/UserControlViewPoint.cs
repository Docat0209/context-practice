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
    public partial class UserControlViewPoint : UserControl
    {
        FormMainMenu _menu;
        public UserControlViewPoint(FormMainMenu menu)
        {
            InitializeComponent();
            _menu = menu;
        }

        private void UserControlViewPoint_Load(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            _menu.setView(new UserControlMain(_menu));
        }
    }
}

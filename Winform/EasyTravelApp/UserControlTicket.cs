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
    public partial class UserControlTicket : UserControl
    {
        FormMainMenu _menu;
        public UserControlTicket(FormMainMenu menu)
        {
            InitializeComponent();
            _menu = menu;
        }

        private void UserControlTicket_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            _menu.setView(new UserControlMain(_menu));
        }
    }
}

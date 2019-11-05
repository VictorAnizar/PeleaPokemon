
import java.util.ArrayList;
import java.util.Hashtable;
public class PokeGrafico1 extends javax.swing.JFrame {
    
   //Se crean los jugadores y sus respectivos conjuntos de pokemones
            ConjuntoPokemones conjunto=new ConjuntoPokemones();
            ArrayList<Pokemon> a1=conjunto.getPokemonsAL();
            ArrayList<Pokemon> a2=conjunto.getPokemonsAL();
          
            Pokemon pokeActual1;
            int posPokeActual1;
            Pokemon pokeActual2;
            int posPokeActual2;
            
            Jugador j1=new Jugador("Jugador1",a1);
            Jugador j2=new Jugador("Jugador2",a2);


    public PokeGrafico1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public int contarVivos(ArrayList<Pokemon> arraylist)
    {
        int contador=0;
        boolean aux;
        while(contador<arraylist.size())
        {
            aux=arraylist.get(contador).estaVivo();
            if(aux==true)
            {
             contador++;   
            }
        }
        
        return contador;
    }
    private void initComponents() {

        b_atacar = new javax.swing.JButton();
        b2_atacar = new javax.swing.JButton();
        b_cambiar = new javax.swing.JButton();
        b2_cambiar = new javax.swing.JButton();
        ta_player1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        ta_player2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        tfJugador1 = new javax.swing.JTextField();
        tfjugador2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        b_atacar.setText("Atacar");
        b_atacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_atacarActionPerformed(evt);
            }
        });

        b2_atacar.setText("Atacar");
        b2_atacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2_atacarActionPerformed(evt);
            }
        });

        b_cambiar.setText("CambiarPoke");
        b_cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cambiarActionPerformed(evt);
            }
        });

        b2_cambiar.setText("CambiarPoke");
        b2_cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2_cambiarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        ta_player1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        ta_player2.setViewportView(jTextArea2);

        tfJugador1.setText("Jugador1");

        tfjugador2.setText("Jugador2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ta_player1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(ta_player2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(tfJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202)
                .addComponent(tfjugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(b_atacar)
                .addGap(201, 201, 201)
                .addComponent(b2_atacar))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(b_cambiar)
                .addGap(153, 153, 153)
                .addComponent(b2_cambiar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ta_player1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ta_player2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfjugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_atacar)
                    .addComponent(b2_atacar))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_cambiar)
                    .addComponent(b2_cambiar)))
        );

        pack();
    }
    int i=0;
    int vivos1;
    private void b_cambiarActionPerformed(java.awt.event.ActionEvent evt) {
        pokeActual1=j1.getPokes().get(i);
        posPokeActual1=i;
        jTextArea1.setText("");
        jTextArea1.append("Pokemon "+posPokeActual1+": "+j1.getPokes().get(i).getNombre());
        jTextArea1.append("\n");
        jTextArea1.append("Vida: "+j1.getPokes().get(i).getPuntoVida());
        jTextArea1.append("\n");
        jTextArea1.append("Defensa: "+j1.getPokes().get(i).getDefensa());
        jTextArea1.append("\n");
        jTextArea1.append("vivo: "+j1.getPokes().get(i).estaVivo());
        jTextArea1.append("\n");
        
        
        
        i++;
        if (i==16) {
            i=0;
        }
        
        vivos1=contarVivos(a1);
        jTextArea1.append("Pokes Vivos: "+vivos1);
        
    }
    private void b_atacarActionPerformed(java.awt.event.ActionEvent evt) {
       
        pokeActual2.recibirDano(pokeActual1.atacar());
        jTextArea2.setText("");
        jTextArea2.append("Pokemon "+i2+": "+pokeActual2.getNombre());
        jTextArea2.append("\n");
        jTextArea2.append("Vida: " + pokeActual2.getPuntoVida());
        jTextArea2.append("\n");
        jTextArea2.append("Defensa: " + pokeActual2.getDefensa());
        jTextArea2.append("\n");
        jTextArea2.append("vivo: " + pokeActual2.estaVivo());
        jTextArea2.append("\n");
    }

    private void b2_atacarActionPerformed(java.awt.event.ActionEvent evt) {
        pokeActual1.recibirDano(pokeActual2.atacar());
        jTextArea1.setText("");
        jTextArea1.append("Pokemon "+i+": "+pokeActual1.getNombre());
        jTextArea1.append("\n");
        jTextArea1.append("Vida: "+pokeActual1.getPuntoVida());
        jTextArea1.append("\n");
        jTextArea1.append("Defensa: "+pokeActual1.getDefensa());
        jTextArea1.append("\n");
        jTextArea1.append("vivo: "+pokeActual1.estaVivo());
        jTextArea1.append("\n");
        

    }
        int i2=0;
        int vivos2;
    private void b2_cambiarActionPerformed(java.awt.event.ActionEvent evt) {
        pokeActual2 = j2.getPokes().get(i2);
        posPokeActual2=i2;
        jTextArea2.setText("");
        jTextArea2.append("Pokemon "+posPokeActual2+": "+pokeActual2.getNombre());
        jTextArea2.append("\n");
        jTextArea2.append("Vida: " + j2.getPokes().get(i2).getPuntoVida());
        jTextArea2.append("\n");
        jTextArea2.append("Defensa: " + j2.getPokes().get(i2).getDefensa());
        jTextArea2.append("\n");
        jTextArea2.append("vivo: " + j2.getPokes().get(i).estaVivo());
        jTextArea2.append("\n");

        
        i2++;
        if (i2==16) {
            i2=0;
        }
        vivos2=contarVivos(a2);
        jTextArea2.append("Pokes Vivos: "+vivos2);
        
    }

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PokeGrafico1().setVisible(true);
            }
        });
    }
    private javax.swing.JButton b2_atacar;
    private javax.swing.JButton b2_cambiar;
    private javax.swing.JButton b_atacar;
    private javax.swing.JButton b_cambiar;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JScrollPane ta_player1;
    private javax.swing.JScrollPane ta_player2;
    private javax.swing.JTextField tfJugador1;
    private javax.swing.JTextField tfjugador2;
   
}

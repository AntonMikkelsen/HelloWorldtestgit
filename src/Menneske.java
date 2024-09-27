public class Menneske {


    private String navn;
    private Menneske ægtefælle;



    public Menneske(String navn) {
            this.navn = navn;
            this.ægtefælle = null;
        }

        public void gifterSigMed () {
        setÆgtefælle(this);
        }

        private void setÆgtefælle (Menneske ægtefælle){
            this.ægtefælle = ægtefælle;

        }

        public Menneske getÆgtefælle () {
            return ægtefælle;
        }

        @Override
        
        public String toString() {
            return navn + "gifter sig med" + ægtefælle;
        }


    }
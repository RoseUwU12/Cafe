package MovementController.Keyboard;

public class LetterKeys {
    private boolean  QKeyPressed;
    private boolean  WKeyPressed;
    private boolean  EKeyPressed; 
    private boolean  RKeyPressed; 
    private boolean  TKeyPressed; 
    private boolean  YKeyPressed; 
    private boolean  UKeyPressed; 
    private boolean  IKeyPressed; 
    private boolean  OKeyPressed;
    private boolean  PKeyPressed;
    private boolean  AKeyPressed;
    private boolean  SKeyPressed; 
    private boolean  DKeyPressed; 
    private boolean  FKeyPressed; 
    private boolean  GKeyPressed; 
    private boolean  HKeyPressed; 
    private boolean  JKeyPressed; 
    private boolean  KKeyPressed; 
    private boolean  LKeyPressed; 
    private boolean  ZKeyPressed; 
    private boolean  XKeyPressed; 
    private boolean  CKeyPressed; 
    private boolean  VKeyPressed; 
    private boolean  BKeyPressed; 
    private boolean  NKeyPressed; 
    private boolean  MKeyPressed; 

    public LetterKeys() { 
        QKeyPressed = false;
        WKeyPressed = false;
        EKeyPressed = false;
        RKeyPressed = false;
        TKeyPressed = false;
        YKeyPressed = false;
        UKeyPressed = false;
        IKeyPressed = false;
        OKeyPressed = false;
        PKeyPressed = false;
        AKeyPressed = false;
        SKeyPressed = false;
        DKeyPressed = false;
        FKeyPressed = false;
        GKeyPressed = false;
        HKeyPressed = false;
        JKeyPressed = false;
        KKeyPressed = false;
        LKeyPressed = false;
        ZKeyPressed = false;
        XKeyPressed = false;
        CKeyPressed = false;
        VKeyPressed = false;
        BKeyPressed = false;
        NKeyPressed = false;
        MKeyPressed = false;


    }

    public void PressLetterKey( int x ) { 
        if ( x == 0 ) { 
            QKeyPressed = true; 
        }
        else if ( x == 1) { 
            WKeyPressed = true; 
        }
        else if ( x == 2) { 
            EKeyPressed = true; 
        }
        else if ( x == 3 ) { 
            RKeyPressed = true; 
        }
        else if ( x == 4 ) { 
            TKeyPressed = true; 
        }
        else if ( x == 5 ) { 
            YKeyPressed = true;
        }
        else if ( x == 6 ) { 
            UKeyPressed = true;
        }
        else if ( x == 7 ) { 
            IKeyPressed = true; 
        }
        else if ( x == 8 )  {
            OKeyPressed = true; 
        }
        else { 

        }

    }
}

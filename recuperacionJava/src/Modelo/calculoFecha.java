package Modelo;

import java.util.Calendar;

public interface calculoFecha {

    public final static int DIA_DEL_MES = Calendar.DAY_OF_MONTH;
    public final static int MES_DEL_ANO = Calendar.MONTH;
    public final static int ANO = Calendar.YEAR;

    public abstract int getMes();
    public abstract int getTrimestre();
    public abstract int getAno();
}

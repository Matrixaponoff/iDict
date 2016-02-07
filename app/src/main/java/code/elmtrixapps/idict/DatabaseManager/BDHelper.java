package code.elmtrixapps.idict.DatabaseManager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ELMTRIX on 7/2/2559.
 */
import static code.elmtrixapps.idict.ConstantsValue.ConstantVariable.DATABASE_NAME;
import static code.elmtrixapps.idict.ConstantsValue.ConstantVariable.DATABASE_VERSION;

import static code.elmtrixapps.idict.ConstantsValue.ConstantVariable.TABLE_NAME_1;
import static code.elmtrixapps.idict.ConstantsValue.ConstantVariable.CHAR_ID;

public class BDHelper extends SQLiteOpenHelper {
    public BDHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+TABLE_NAME_1 +" ( "+CHAR_ID);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

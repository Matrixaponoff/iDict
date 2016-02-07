package code.elmtrixapps.idict.ConstantsValue;

import android.provider.BaseColumns;

/**
 * Created by ELMTRIX on 7/2/2559.
 */
public interface ConstantVariable extends BaseColumns {
    public static final String DATABASE_NAME = "iDict.db";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME_1 = "vocabulary";
        public static final String CHAR_ID = "char_id";
        public static final String CHARACTERS = "characters";
}

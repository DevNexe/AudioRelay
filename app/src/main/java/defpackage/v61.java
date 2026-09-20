package defpackage;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
public final class v61 extends u61 {
    public final SQLiteStatement x;

    public v61(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.x = sQLiteStatement;
    }

    public final int h() {
        return this.x.executeUpdateDelete();
    }
}

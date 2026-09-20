package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w14 implements y14.QnHx {
    public final /* synthetic */ int w;
    public final /* synthetic */ y14 x;

    public /* synthetic */ w14(y14 y14Var, int i) {
        this.w = i;
        this.x = y14Var;
    }

    @Override // y14.QnHx
    public final Object apply(Object obj) {
        int i = this.w;
        y14 y14Var = this.x;
        switch (i) {
            case 0:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                y14Var.getClass();
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + y14Var.x.a()).execute();
                break;
            default:
                Cursor cursor = (Cursor) obj;
                y14Var.getClass();
                while (cursor.moveToNext()) {
                    y14Var.f(cursor.getInt(0), l52.QnHx.MAX_RETRIES_REACHED, cursor.getString(1));
                }
                break;
        }
        return null;
    }
}

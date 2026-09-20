package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.text.format.DateUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.internal.CQf;
import com.google.firebase.remoteconfig.internal.QnHx;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v14 implements y14.QnHx, a90 {
    public final /* synthetic */ long w;
    public final /* synthetic */ Object x;

    public /* synthetic */ v14(long j, ua5 ua5Var) {
        this.w = j;
        this.x = ua5Var;
    }

    public /* synthetic */ v14(QnHx qnHx, long j) {
        this.x = qnHx;
        this.w = j;
    }

    @Override // y14.QnHx
    public final Object apply(Object obj) {
        ua5 ua5Var = (ua5) this.x;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.w));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{ua5Var.b(), String.valueOf(ke3.a(ua5Var.d()))}) < 1) {
            contentValues.put("backend_name", ua5Var.b());
            contentValues.put("priority", Integer.valueOf(ke3.a(ua5Var.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // defpackage.a90
    public final Object then(w05 w05Var) {
        w05 w05VarI;
        QnHx qnHx = (QnHx) this.x;
        int[] iArr = QnHx.j;
        qnHx.getClass();
        Date date = new Date(System.currentTimeMillis());
        boolean zN = w05Var.n();
        CQf cQf = qnHx.g;
        if (zN) {
            cQf.getClass();
            Date date2 = new Date(cQf.a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(CQf.d) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(this.w) + date2.getTime()))) {
                return k15.e(new QnHx.C0088QnHx(2, null, null));
            }
        }
        Date date3 = cQf.a().b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = qnHx.c;
        if (date4 != null) {
            String str = String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime())));
            date4.getTime();
            w05VarI = k15.d(new FirebaseRemoteConfigFetchThrottledException(str));
        } else {
            yx0 yx0Var = qnHx.a;
            kc7 id = yx0Var.getId();
            kc7 kc7VarA = yx0Var.a();
            w05VarI = k15.g(id, kc7VarA).i(executor, new zq3(qnHx, id, kc7VarA, date));
        }
        return w05VarI.i(executor, new ke5(qnHx, date));
    }
}

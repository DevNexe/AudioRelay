package defpackage;

import android.database.sqlite.SQLiteDatabase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.internal.CQf;
import com.google.firebase.remoteconfig.internal.QnHx;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ke5 implements qy4.QnHx, y14.QnHx, a90, fs2 {
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ ke5(Object obj, Object obj2) {
        this.x = obj;
        this.w = obj2;
    }

    @Override // defpackage.fs2
    public final void a(dr2.QnHx qnHx) {
        la0 la0Var = (la0) this.x;
        mz0 mz0Var = (mz0) this.w;
        ha1 ha1Var = ha1.w;
        md5 md5Var = rl0.b;
        md5Var.getClass();
        bm0.m(qnHx, new av3(new w04(fp1.j0(ha1Var, la0.QnHx.a(md5Var, la0Var), 3, new z04(mz0Var, qnHx, null)))));
    }

    @Override // y14.QnHx
    public final Object apply(Object obj) {
        y14 y14Var = (y14) this.x;
        ua5 ua5Var = (ua5) this.w;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        os0 os0Var = y14.B;
        y14Var.getClass();
        ArrayList arrayList = new ArrayList();
        Long lH = y14.h(sQLiteDatabase, ua5Var);
        if (lH != null) {
            y14.m(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lH.toString()}, null, null, null, String.valueOf(y14Var.z.c())), new ar3(y14Var, arrayList, ua5Var));
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(((v03) arrayList.get(i)).b());
            if (i < arrayList.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        y14.m(sQLiteDatabase.query("event_metadata", new String[]{"event_id", MediationMetaData.KEY_NAME, "value"}, sb.toString(), null, null, null, null), new im3(map, 8));
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            v03 v03Var = (v03) listIterator.next();
            if (map.containsKey(Long.valueOf(v03Var.b()))) {
                o3.QnHx qnHxI = v03Var.a().i();
                for (y14.CQf cQf : (Set) map.get(Long.valueOf(v03Var.b()))) {
                    qnHxI.a(cQf.a, cQf.b);
                }
                listIterator.set(new y3(v03Var.b(), v03Var.c(), qnHxI.b()));
            }
        }
        return arrayList;
    }

    @Override // qy4.QnHx
    public final Object e() {
        ne5 ne5Var = (ne5) this.x;
        return ne5Var.c.t((ua5) this.w);
    }

    @Override // defpackage.a90
    public final Object then(w05 w05Var) {
        QnHx qnHx = (QnHx) this.x;
        Date date = (Date) this.w;
        int[] iArr = QnHx.j;
        qnHx.getClass();
        if (w05Var.n()) {
            CQf cQf = qnHx.g;
            synchronized (cQf.b) {
                cQf.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
        } else {
            Exception excJ = w05Var.j();
            if (excJ != null) {
                if (excJ instanceof FirebaseRemoteConfigFetchThrottledException) {
                    CQf cQf2 = qnHx.g;
                    synchronized (cQf2.b) {
                        cQf2.a.edit().putInt("last_fetch_status", 2).apply();
                    }
                } else {
                    CQf cQf3 = qnHx.g;
                    synchronized (cQf3.b) {
                        cQf3.a.edit().putInt("last_fetch_status", 1).apply();
                    }
                }
            }
        }
        return w05Var;
    }
}

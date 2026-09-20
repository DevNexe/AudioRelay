package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.android.billingclient.api.NUlFixed;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Z7O implements ol4, r60.CQf, yu2, px, ah3, fs2, qy4.QnHx, y14.QnHx {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ Z7O(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    @Override // defpackage.fs2
    public final void a(dr2.QnHx qnHx) {
        ServerSocket serverSocket = (ServerSocket) this.y;
        while (!qnHx.e()) {
            try {
                a62 a62Var = a62.a;
                a62Var.k("Waiting new clients...");
                Socket socketAccept = serverSocket.accept();
                socketAccept.setTcpNoDelay(true);
                ps psVar = new ps(socketAccept);
                a62Var.c("Remote device connected: " + psVar.d);
                qnHx.b(psVar);
            } catch (Throwable th) {
                qnHx.c(th);
            }
        }
    }

    @Override // y14.QnHx
    public final Object apply(Object obj) {
        y14 y14Var = (y14) this.x;
        ua5 ua5Var = (ua5) this.y;
        os0 os0Var = y14.B;
        y14Var.getClass();
        Long lH = y14.h((SQLiteDatabase) obj, ua5Var);
        return lH == null ? Boolean.FALSE : (Boolean) y14.m(y14Var.g().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lH.toString()}), new mk5(4));
    }

    @Override // defpackage.ah3
    public final void b(NUlFixed nUl, List list) {
        dl4 dl4Var = (dl4) this.x;
        pa paVar = (pa) this.y;
        int i = nUl.a;
        if (i == 0) {
            ((yk4.QnHx) dl4Var).b(list);
            return;
        }
        a62 a62Var = a62.a;
        paVar.b.getClass();
        a62Var.h("billing", "inventory_query_failed", fXUx.d(i));
        yk4.QnHx qnHx = (yk4.QnHx) dl4Var;
        qnHx.c(paVar.c.a(fXUx.d(nUl.a)));
    }

    @Override // defpackage.ol4
    public final void c(yk4.QnHx qnHx) {
        ix5 ix5Var;
        EWe eWe = (EWe) this.x;
        Activity activity = (Activity) this.y;
        Context context = eWe.b;
        synchronized (gd6.class) {
            try {
                if (gd6.a == null) {
                    Application application = (Application) context.getApplicationContext();
                    application.getClass();
                    gd6.a = new ix5(application);
                }
                ix5Var = gd6.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        m17 m17VarZzb = ix5Var.c.zzb();
        s60.QnHx qnHx2 = new s60.QnHx();
        qnHx2.a = false;
        s60 s60Var = new s60(qnHx2);
        Z7O z7o = new Z7O(1, m17VarZzb, qnHx);
        gcF gcf = new gcF(qnHx);
        yb7 yb7Var = m17VarZzb.b;
        yb7Var.getClass();
        yb7Var.c.execute(new n97(yb7Var, activity, s60Var, z7o, gcf));
    }

    @Override // defpackage.px
    public final void d(uw.QnHx qnHx) {
        e61 e61Var = (e61) this.x;
        tf0 tf0Var = (tf0) this.y;
        try {
            e8 e8Var = new e8(((mn2) e61Var.a).c.c);
            wf0 wf0Var = new wf0(tf0Var);
            while (!qnHx.e()) {
                List list = (List) ((BlockingQueue) e61Var.b).poll(100L, TimeUnit.MILLISECONDS);
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        e8Var.a(OW8.y((byte[]) list.get(i), 0, 3), false, wf0Var);
                    }
                }
            }
        } catch (InterruptedException unused) {
            a62 a62Var = a62.a;
        } finally {
            qnHx.b();
        }
    }

    @Override // qy4.QnHx
    public final Object e() {
        int i = this.w;
        Object obj = this.y;
        Object obj2 = this.x;
        switch (i) {
            case 6:
                return Boolean.valueOf(((ne5) obj2).c.j0((ua5) obj));
            default:
                ((ne5) obj2).c.q((Iterable) obj);
                return null;
        }
    }

    public final void f(Exception exc) {
        z05 z05Var = (z05) this.x;
        gc0 gc0Var = (gc0) this.y;
        if (exc != null) {
            z05Var.b(exc);
        } else {
            z05Var.c(gc0Var);
        }
    }

    @Override // defpackage.yu2
    public final void onSuccess(Object obj) {
        ((yk4.QnHx) ((dl4) this.x)).b((cy0) this.y);
    }
}

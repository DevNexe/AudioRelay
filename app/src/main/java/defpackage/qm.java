package defpackage;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.CQf;
import androidx.work.impl.model.QnHx;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public abstract class qm implements Runnable {
    public final qv2 w = new qv2();

    public static void a(nn5 nn5Var, String str) {
        WorkDatabase workDatabase = nn5Var.y;
        QnHx qnHxN = workDatabase.n();
        mj0 mj0VarI = workDatabase.i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (true) {
            if (linkedList.isEmpty()) {
                break;
            }
            String str2 = (String) linkedList.remove();
            CQf cQf = (CQf) qnHxN;
            kn5 kn5VarF = cQf.f(str2);
            if (kn5VarF != kn5.SUCCEEDED && kn5VarF != kn5.FAILED) {
                cQf.n(kn5.CANCELLED, str2);
            }
            linkedList.addAll(((nj0) mj0VarI).a(str2));
        }
        oe3 oe3Var = nn5Var.B;
        synchronized (oe3Var.G) {
            s52.c().a(oe3.H, String.format("Processor cancelling %s", str), new Throwable[0]);
            oe3Var.E.add(str);
            go5 go5Var = (go5) oe3Var.B.remove(str);
            boolean z = go5Var != null;
            if (go5Var == null) {
                go5Var = (go5) oe3Var.C.remove(str);
            }
            oe3.b(str, go5Var);
            if (z) {
                oe3Var.g();
            }
        }
        Iterator<d54> it = nn5Var.A.iterator();
        while (it.hasNext()) {
            it.next().d(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        qv2 qv2Var = this.w;
        try {
            b();
            qv2Var.a(pv2.a);
        } catch (Throwable th) {
            qv2Var.a(new pv2.QnHx.C0183QnHx(th));
        }
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class tf4 extends B8C {
    public final d7G w;
    public final rg3<sd5> x = new rg3<>();
    public volatile List<? extends je4> y = cs0.w;

    public /* synthetic */ class QnHx extends l91 implements j81<je4, sd5> {
        public QnHx(Object obj) {
            super(1, obj, tf4.class, "onSessionStopped", "onSessionStopped(Lcom/azefsw/audioconnect/server/session/ServerSession;)V", 0);
        }

        @Override // defpackage.j81
        public final sd5 invoke(je4 je4Var) {
            je4 je4Var2 = je4Var;
            tf4 tf4Var = (tf4) this.x;
            synchronized (tf4Var) {
                tf4Var.V0(je4Var2);
            }
            return sd5.a;
        }
    }

    public tf4(d7G d7g) {
        this.w = d7g;
    }

    @Override // defpackage.B8C
    public final List<je4> C0() {
        List list;
        synchronized (this) {
            list = this.y;
        }
        return list;
    }

    @Override // defpackage.B8C
    public final cs2 D0(c54 c54Var) {
        return new cs2(this.x.x(sd5.a).u(c54Var), new sf4(this, 0));
    }

    @Override // defpackage.B8C
    public final vq2<List<no5>> E0(c54 c54Var) {
        return D0(c54Var).B(new i71(4, this, c54Var));
    }

    @Override // defpackage.B8C
    public final ds2 F0(c54 c54Var) {
        vq2<sd5> vq2VarX = this.x.x(sd5.a);
        sf4 sf4Var = new sf4(this, 1);
        vq2VarX.getClass();
        return new hr2(new cs2(new cs2(vq2VarX, sf4Var), new Acr(16))).u(c54Var);
    }

    @Override // defpackage.B8C
    public final void N0() {
        synchronized (this) {
            Iterator<T> it = this.y.iterator();
            while (it.hasNext()) {
                ((je4) it.next()).stop();
            }
            sd5 sd5Var = sd5.a;
        }
    }

    @Override // defpackage.B8C
    public final void P0(eg4 eg4Var) {
        a62.a.k("Trying to start a new session " + ((String) eg4Var.A));
        synchronized (this) {
            X0((String) eg4Var.A);
            W0(eg4Var);
            sd5 sd5Var = sd5.a;
        }
    }

    public final void V0(je4 je4Var) {
        synchronized (this) {
            if (this.y.contains(je4Var)) {
                this.y = wu.S0(this.y, je4Var);
                this.x.g(sd5.a);
            }
        }
    }

    public final void W0(eg4 eg4Var) {
        d7G d7g = this.w;
        QnHx qnHx = new QnHx(this);
        d7g.getClass();
        ve4 ve4Var = new ve4(zs.QnHx.a.c(), (ps) eg4Var.y, (w50) eg4Var.z, (pq2) d7g.x, qnHx, (hg4) ((h81) d7g.y).invoke());
        this.y = wu.V0(ve4Var, this.y);
        this.x.g(sd5.a);
        pq2 pq2Var = (pq2) eg4Var.x;
        se4 se4Var = new se4(ve4Var);
        Set setA = ((bq1) pq2Var.w).b().a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setA) {
            if (((bf4) obj).a(se4Var)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(mu.w0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((bf4) it.next()).b(se4Var).c(new J(ve4Var, 15)));
        }
        ve4Var.h.b(jw4.a(qw.e(arrayList2).i(j54.b), new ue4(ve4Var)));
    }

    public final void X0(String str) {
        Object next;
        Iterator<T> it = this.y.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!ur1.a(((je4) next).n(), str));
        je4 je4Var = (je4) next;
        if (je4Var != null) {
            a62 a62Var = a62.a;
            a62.a.g("client_was_already_connected", null);
            a62Var.k("Closing an already existing session " + je4Var.n());
            synchronized (this) {
                je4Var.stop();
                V0(je4Var);
                sd5 sd5Var = sd5.a;
            }
        }
    }
}

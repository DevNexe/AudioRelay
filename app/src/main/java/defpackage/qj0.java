package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class qj0 implements lj0 {
    public final cm5 d;
    public int f;
    public int g;
    public cm5 a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public zk0 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public qj0(cm5 cm5Var) {
        this.d = cm5Var;
    }

    @Override // defpackage.lj0
    public final void a(lj0 lj0Var) {
        ArrayList<qj0> arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((qj0) it.next()).j) {
                return;
            }
        }
        this.c = true;
        cm5 cm5Var = this.a;
        if (cm5Var != null) {
            cm5Var.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        qj0 qj0Var = null;
        int i = 0;
        for (qj0 qj0Var2 : arrayList) {
            if (!(qj0Var2 instanceof zk0)) {
                i++;
                qj0Var = qj0Var2;
            }
        }
        if (qj0Var != null && i == 1 && qj0Var.j) {
            zk0 zk0Var = this.i;
            if (zk0Var != null) {
                if (!zk0Var.j) {
                    return;
                } else {
                    this.f = this.h * zk0Var.g;
                }
            }
            d(qj0Var.g + this.f);
        }
        cm5 cm5Var2 = this.a;
        if (cm5Var2 != null) {
            cm5Var2.a(this);
        }
    }

    public final void b(lj0 lj0Var) {
        this.k.add(lj0Var);
        if (this.j) {
            lj0Var.a(lj0Var);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (lj0 lj0Var : this.k) {
            lj0Var.a(lj0Var);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.Y);
        sb.append(":");
        sb.append(pj0.c(this.e));
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}

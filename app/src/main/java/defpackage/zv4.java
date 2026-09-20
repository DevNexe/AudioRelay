package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zv4 implements yl0 {
    public final /* synthetic */ is4 a;

    public zv4(is4 is4Var) {
        this.a = is4Var;
    }

    @Override // defpackage.yl0
    public final void a() {
        gz1 gz1VarA = ((aw4) this.a.getValue()).a();
        yy1 yy1Var = gz1VarA.a;
        yy1Var.G = true;
        LinkedHashMap linkedHashMap = gz1VarA.e;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            k40 k40Var = ((gz1.QnHx) it.next()).c;
            if (k40Var != null) {
                k40Var.a();
            }
        }
        ui2<yy1> ui2Var = yy1Var.y;
        for (int i = ui2Var.y - 1; -1 < i; i--) {
            yy1Var.K(ui2Var.w[i]);
        }
        ui2Var.e();
        yy1Var.G = false;
        linkedHashMap.clear();
        gz1VarA.f.clear();
        gz1VarA.k = 0;
        gz1VarA.j = 0;
        gz1VarA.h.clear();
        gz1VarA.b();
    }
}

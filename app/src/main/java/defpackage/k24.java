package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k24 implements yl0 {
    public final /* synthetic */ j24.F1 a;
    public final /* synthetic */ j24 b;
    public final /* synthetic */ Object c;

    public k24(j24.F1 f1, j24 j24Var, Object obj) {
        this.a = f1;
        this.b = j24Var;
        this.c = obj;
    }

    @Override // defpackage.yl0
    public final void a() {
        j24 j24Var = this.b;
        Map<Object, Map<String, List<Object>>> map = j24Var.a;
        j24.F1 f1 = this.a;
        if (f1.b) {
            Map<String, List<Object>> mapC = f1.c.c();
            boolean zIsEmpty = mapC.isEmpty();
            Object obj = f1.a;
            if (zIsEmpty) {
                map.remove(obj);
            } else {
                map.put(obj, mapC);
            }
        }
        j24Var.b.remove(this.c);
    }
}

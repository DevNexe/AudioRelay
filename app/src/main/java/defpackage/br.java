package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class br {
    public List<? extends Annotation> a = cs0.w;
    public final ArrayList b = new ArrayList();
    public final HashSet c = new HashSet();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public static void a(br brVar, String str, pa4 pa4Var) {
        cs0 cs0Var = cs0.w;
        if (!brVar.c.add(str)) {
            throw new IllegalArgumentException(fc2.a("Element with name '", str, "' is already registered").toString());
        }
        brVar.b.add(str);
        brVar.d.add(pa4Var);
        brVar.e.add(cs0Var);
        brVar.f.add(false);
    }
}

package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class e74<T> extends QX<T> {
    public final fv1<T> a;
    public final List<? extends Annotation> b;
    public final oz1 c;
    public final Map<fv1<? extends T>, rv1<? extends T>> d;
    public final LinkedHashMap e;

    public e74(String str, ar arVar, fv1[] fv1VarArr, rv1[] rv1VarArr, Annotation[] annotationArr) {
        this.a = arVar;
        this.b = cs0.w;
        this.c = qLd.h(2, new d74(str, this, rv1VarArr));
        if (fv1VarArr.length != rv1VarArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + arVar.a() + " should be marked @Serializable");
        }
        int iMin = Math.min(fv1VarArr.length, rv1VarArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(new uy2(fv1VarArr[i], rv1VarArr[i]));
        }
        Map<fv1<? extends T>, rv1<? extends T>> mapV = t92.V(arrayList);
        this.d = mapV;
        Set<Map.Entry<fv1<? extends T>, rv1<? extends T>>> setEntrySet = mapV.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strA = ((rv1) entry.getValue()).a().a();
            Object obj = linkedHashMap.get(strA);
            if (obj == null) {
                linkedHashMap.containsKey(strA);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + this.a + "' have the same serial name '" + strA + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(strA, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C0239D.A(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (rv1) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.e = linkedHashMap2;
        this.b = Arrays.asList(annotationArr);
    }

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return (pa4) this.c.getValue();
    }

    @Override // defpackage.QX
    public final zj0<? extends T> f(g40 g40Var, String str) {
        rv1 rv1Var = (rv1) this.e.get(str);
        return rv1Var != null ? rv1Var : super.f(g40Var, str);
    }

    @Override // defpackage.QX
    public final db4<T> g(ls0 ls0Var, T t) {
        rv1<? extends T> rv1VarG = this.d.get(nl3.a(t.getClass()));
        if (rv1VarG == null) {
            rv1VarG = super.g(ls0Var, t);
        }
        if (rv1VarG != null) {
            return rv1VarG;
        }
        return null;
    }

    @Override // defpackage.QX
    public final fv1<T> h() {
        return this.a;
    }
}

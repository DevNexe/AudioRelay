package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.JvmClassMappingKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ll3<ElementKlass, Element extends ElementKlass> extends hu<Element, Element[], ArrayList<Element>> {
    public final fv1<ElementKlass> b;
    public final hS c;

    public ll3(fv1<ElementKlass> fv1Var, rv1<Element> rv1Var) {
        super(rv1Var);
        this.b = fv1Var;
        this.c = new hS(rv1Var.a());
    }

    @Override // defpackage.hu, defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return this.c;
    }

    @Override // defpackage.T23
    public final Object f() {
        return new ArrayList();
    }

    @Override // defpackage.T23
    public final int g(Object obj) {
        return ((ArrayList) obj).size();
    }

    @Override // defpackage.T23
    public final Iterator h(Object obj) {
        return new tj1((Object[]) obj);
    }

    @Override // defpackage.T23
    public final int i(Object obj) {
        return ((Object[]) obj).length;
    }

    @Override // defpackage.T23
    public final Object l(Object obj) {
        return new ArrayList(Arrays.asList(null));
    }

    @Override // defpackage.T23
    public final Object m(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) JvmClassMappingKt.getJavaClass((fv1) this.b), arrayList.size()));
    }

    @Override // defpackage.hu
    public final void n(int i, Object obj, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }
}

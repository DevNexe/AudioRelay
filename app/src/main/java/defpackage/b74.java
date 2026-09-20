package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class b74 extends cx1 implements j81<br, sd5> {
    public final /* synthetic */ rv1<Object>[] w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b74(rv1<Object>[] rv1VarArr) {
        super(1);
        this.w = rv1VarArr;
    }

    @Override // defpackage.j81
    public final sd5 invoke(br brVar) {
        br brVar2 = brVar;
        rv1<Object>[] rv1VarArr = this.w;
        LinkedHashSet linkedHashSet = new LinkedHashSet(C0239D.A(rv1VarArr.length));
        oV9.i0(linkedHashSet, rv1VarArr);
        Iterator it = wu.e1(linkedHashSet).iterator();
        while (it.hasNext()) {
            pa4 pa4VarA = ((rv1) it.next()).a();
            br.a(brVar2, pa4VarA.a(), pa4VarA);
        }
        return sd5.a;
    }
}

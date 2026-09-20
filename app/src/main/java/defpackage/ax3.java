package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ax3 extends cx1 implements j81<n52, sd5> {
    public final /* synthetic */ ev3.ck32 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax3(ev3.ck32 ck32Var) {
        super(1);
        this.w = ck32Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(n52 n52Var) {
        n52 n52Var2 = n52Var;
        Integer numValueOf = Integer.valueOf(this.w.a);
        LinkedHashMap linkedHashMap = n52Var2.c;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            n52Var2.c = linkedHashMap;
        }
        linkedHashMap.put("gain", numValueOf);
        return sd5.a;
    }
}

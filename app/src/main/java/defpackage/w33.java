package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w33 extends cx1 implements j81<qk, sd5> {
    public final /* synthetic */ List<qk> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w33(ArrayList arrayList) {
        super(1);
        this.w = arrayList;
    }

    @Override // defpackage.j81
    public final sd5 invoke(qk qkVar) {
        this.w.add(qkVar.a());
        return sd5.a;
    }
}

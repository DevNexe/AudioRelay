package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u30 extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
    public final /* synthetic */ hl3 w;
    public final /* synthetic */ List<Object> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u30(hl3 hl3Var, ArrayList arrayList) {
        super(3);
        this.w = hl3Var;
        this.x = arrayList;
    }

    @Override // defpackage.y81
    public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
        jE<?> jEVar2 = jEVar;
        int i = this.w.w;
        List<Object> list = this.x;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            jEVar2.b(i3, obj);
            jEVar2.h(i3, obj);
        }
        return sd5.a;
    }
}

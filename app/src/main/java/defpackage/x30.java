package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x30 extends cx1 implements y81<jE<?>, mn4, xl3, sd5> {
    public final /* synthetic */ hl3 w;
    public final /* synthetic */ List<y81<jE<?>, mn4, xl3, sd5>> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x30(hl3 hl3Var, ArrayList arrayList) {
        super(3);
        this.w = hl3Var;
        this.x = arrayList;
    }

    @Override // defpackage.y81
    public final sd5 invoke(jE<?> jEVar, mn4 mn4Var, xl3 xl3Var) {
        jE<?> lt2Var = jEVar;
        mn4 mn4Var2 = mn4Var;
        xl3 xl3Var2 = xl3Var;
        int i = this.w.w;
        if (i > 0) {
            lt2Var = new lt2(lt2Var, i);
        }
        List<y81<jE<?>, mn4, xl3, sd5>> list = this.x;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2).invoke(lt2Var, mn4Var2, xl3Var2);
        }
        return sd5.a;
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v90 extends cx1 implements j81<List<o55>, Boolean> {
    public final /* synthetic */ u45 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v90(u45 u45Var) {
        super(1);
        this.w = u45Var;
    }

    @Override // defpackage.j81
    public final Boolean invoke(List<o55> list) {
        boolean z;
        List<o55> list2 = list;
        u45 u45Var = this.w;
        if (u45Var.c() != null) {
            list2.add(u45Var.c().a);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

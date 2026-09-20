package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x15 extends cx1 implements j81<List<o55>, Boolean> {
    public final /* synthetic */ w15 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x15(w15 w15Var) {
        super(1);
        this.w = w15Var;
    }

    @Override // defpackage.j81
    public final Boolean invoke(List<o55> list) {
        boolean z;
        List<o55> list2 = list;
        o55 o55Var = this.w.w.f;
        if (o55Var != null) {
            list2.add(o55Var);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

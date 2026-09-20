package androidx.compose.ui.platform;

import defpackage.Ll;
import defpackage.cx1;
import defpackage.g30;
import defpackage.sd5;
import defpackage.x81;

/* JADX INFO: loaded from: classes.dex */
public final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ WrappedComposition w;
    public final /* synthetic */ x81<g30, Integer, sd5> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LPt8Fixed(WrappedComposition wrappedComposition, x81<? super g30, ? super Integer, sd5> x81Var) {
        super(2);
        this.w = wrappedComposition;
        this.x = x81Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            Ll.a(this.w.w, this.x, g30Var2, 8);
        }
        return sd5.a;
    }
}

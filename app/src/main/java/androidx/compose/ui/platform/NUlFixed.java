package androidx.compose.ui.platform;

import android.view.View;
import com.azefsw.audioconnect.R;
import defpackage.X;
import defpackage.cx1;
import defpackage.g30;
import defpackage.jv1;
import defpackage.ng3;
import defpackage.ov1;
import defpackage.q40;
import defpackage.sd5;
import defpackage.wq0;
import defpackage.x81;
import defpackage.xo1;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class NUlFixed extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ WrappedComposition w;
    public final /* synthetic */ x81<g30, Integer, sd5> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NUlFixed(WrappedComposition wrappedComposition, x81<? super g30, ? super Integer, sd5> x81Var) {
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
            WrappedComposition wrappedComposition = this.w;
            Object tag = wrappedComposition.w.getTag(R.id.inspection_slot_table_set);
            Set set = (tag instanceof Set) && (!(tag instanceof jv1) || (tag instanceof ov1)) ? (Set) tag : null;
            AndroidComposeView androidComposeView = wrappedComposition.w;
            if (set == null) {
                Object parent = androidComposeView.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (tag2 instanceof Set) && (!(tag2 instanceof jv1) || (tag2 instanceof ov1)) ? (Set) tag2 : null;
            }
            if (set != null) {
                set.add(g30Var2.k());
                g30Var2.a();
            }
            wq0.d(androidComposeView, new CQf(wrappedComposition, null), g30Var2);
            wq0.d(androidComposeView, new F1(wrappedComposition, null), g30Var2);
            q40.a(new ng3[]{xo1.a.b(set)}, X.m(g30Var2, -1193460702, new LPt8Fixed(wrappedComposition, this.x)), g30Var2, 56);
        }
        return sd5.a;
    }
}

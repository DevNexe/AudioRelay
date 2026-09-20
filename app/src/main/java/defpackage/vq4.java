package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;

/* JADX INFO: loaded from: classes.dex */
public final class vq4 extends cx1 implements y81<rq4, Integer, Integer, sd5> {
    public final /* synthetic */ Spannable w;
    public final /* synthetic */ a91<e41, x41, v41, w41, Typeface> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq4(SpannableString spannableString, C1640oT c1640oT) {
        super(3);
        this.w = spannableString;
        this.x = c1640oT;
    }

    @Override // defpackage.y81
    public final sd5 invoke(rq4 rq4Var, Integer num, Integer num2) {
        rq4 rq4Var2 = rq4Var;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        x41 x41Var = rq4Var2.c;
        if (x41Var == null) {
            x41Var = x41.z;
        }
        v41 v41Var = rq4Var2.d;
        v41 v41Var2 = new v41(v41Var != null ? v41Var.a : 0);
        w41 w41Var = rq4Var2.e;
        this.w.setSpan(new j41(this.x.I(rq4Var2.f, x41Var, v41Var2, new w41(w41Var != null ? w41Var.a : 1))), iIntValue, iIntValue2, 33);
        return sd5.a;
    }
}

package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class ed3 {
    public static final ed3 d = new ed3(new rp3(R.string.premium_subscription_trial_action), new rp3(R.string.premium_inapp_action), new rp3(R.string.premium_subscription_free_trial));
    public final h22 a;
    public final h22 b;
    public final h22 c;

    public ed3(rp3 rp3Var, rp3 rp3Var2, rp3 rp3Var3) {
        this.a = rp3Var;
        this.b = rp3Var2;
        this.c = rp3Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed3)) {
            return false;
        }
        ed3 ed3Var = (ed3) obj;
        return ur1.a(this.a, ed3Var.a) && ur1.a(this.b, ed3Var.b) && ur1.a(this.c, ed3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PremiumTextsConfig(subscribeText=" + this.a + ", inAppPurchaseText=" + this.b + ", freeTrialText=" + this.c + ")";
    }
}

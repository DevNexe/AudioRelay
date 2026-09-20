package defpackage;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class up5 {
    public final Hp<?> a;
    public final tw0 b;

    public /* synthetic */ up5(Hp hp, tw0 tw0Var) {
        this.a = hp;
        this.b = tw0Var;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof up5)) {
            up5 up5Var = (up5) obj;
            if (tq2.a(this.a, up5Var.a) && tq2.a(this.b, up5Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        tq2.QnHx qnHx = new tq2.QnHx(this);
        qnHx.a(this.a, SubscriberAttributeKt.JSON_NAME_KEY);
        qnHx.a(this.b, "feature");
        return qnHx.toString();
    }
}

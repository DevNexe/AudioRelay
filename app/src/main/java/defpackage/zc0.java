package defpackage;

import com.android.billingclient.api.Purchase;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zc0 {
    public final int a;
    public final List<Purchase> b;

    public zc0(List list, int i) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc0)) {
            return false;
        }
        zc0 zc0Var = (zc0) obj;
        return this.a == zc0Var.a && ur1.a(this.b, zc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a * 31);
    }

    public final String toString() {
        return "CustomBillingResponse(responseCode=" + this.a + ", purchases=" + this.b + ")";
    }
}

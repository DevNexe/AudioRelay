package defpackage;

import com.facebook.ads.AdError;

/* JADX INFO: loaded from: classes.dex */
public final class audiorelay_net implements o53 {
    public final int a;

    public audiorelay_net(int i) {
        this.a = i;
    }

    @Override // defpackage.o53
    public final int a(int i) {
        return i;
    }

    @Override // defpackage.o53
    public final e41 b(e41 e41Var) {
        return e41Var;
    }

    @Override // defpackage.o53
    public final int c(int i) {
        return i;
    }

    @Override // defpackage.o53
    public final x41 d(x41 x41Var) {
        int i = this.a;
        return (i == 0 || i == Integer.MAX_VALUE) ? x41Var : new x41(AY.o(x41Var.w + i, 1, AdError.NETWORK_ERROR_CODE));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof audiorelay_net) && this.a == ((audiorelay_net) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return qc0.a(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.a, ')');
    }
}

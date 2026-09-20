package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class hg5 implements h22 {
    public final String a = "asapha@audiorelay.net";

    @Override // defpackage.h22
    public final String a(Context context) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hg5) && ur1.a(this.a, ((hg5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return i5.b(new StringBuilder("ValueString(value="), this.a, ")");
    }
}

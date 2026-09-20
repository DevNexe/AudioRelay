package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class rp3 implements h22 {
    public final int a;

    public rp3(int i) {
        this.a = i;
    }

    @Override // defpackage.h22
    public final String a(Context context) {
        return context.getString(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rp3) && this.a == ((rp3) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return ex0.c(new StringBuilder("ResourceString(value="), this.a, ")");
    }
}

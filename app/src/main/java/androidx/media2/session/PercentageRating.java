package androidx.media2.session;

import androidx.media2.common.Rating;
import defpackage.uq2;

/* JADX INFO: loaded from: classes.dex */
public final class PercentageRating implements Rating {
    public float a = -1.0f;

    public final boolean equals(Object obj) {
        return (obj instanceof PercentageRating) && this.a == ((PercentageRating) obj).a;
    }

    public final int hashCode() {
        return uq2.b(Float.valueOf(this.a));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PercentageRating: ");
        if (this.a != -1.0f) {
            str = "percentage=" + this.a;
        } else {
            str = "unrated";
        }
        sb.append(str);
        return sb.toString();
    }
}

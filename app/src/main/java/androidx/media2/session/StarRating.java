package androidx.media2.session;

import androidx.media2.common.Rating;
import defpackage.uq2;

/* JADX INFO: loaded from: classes.dex */
public final class StarRating implements Rating {
    public int a;
    public float b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof StarRating)) {
            return false;
        }
        StarRating starRating = (StarRating) obj;
        return this.a == starRating.a && this.b == starRating.b;
    }

    public final int hashCode() {
        return uq2.b(Integer.valueOf(this.a), Float.valueOf(this.b));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("StarRating: maxStars=");
        sb.append(this.a);
        if (this.b >= 0.0f) {
            str = ", starRating=" + this.b;
        } else {
            str = ", unrated";
        }
        sb.append(str);
        return sb.toString();
    }
}

package androidx.media2.session;

import androidx.media2.common.Rating;
import defpackage.uq2;

/* JADX INFO: loaded from: classes.dex */
public final class HeartRating implements Rating {
    public boolean a = false;
    public boolean b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof HeartRating)) {
            return false;
        }
        HeartRating heartRating = (HeartRating) obj;
        return this.b == heartRating.b && this.a == heartRating.a;
    }

    public final int hashCode() {
        return uq2.b(Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("HeartRating: ");
        if (this.a) {
            str = "hasHeart=" + this.b;
        } else {
            str = "unrated";
        }
        sb.append(str);
        return sb.toString();
    }
}

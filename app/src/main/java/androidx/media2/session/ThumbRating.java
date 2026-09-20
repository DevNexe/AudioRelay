package androidx.media2.session;

import androidx.media2.common.Rating;
import defpackage.uq2;

/* JADX INFO: loaded from: classes.dex */
public final class ThumbRating implements Rating {
    public boolean a = false;
    public boolean b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof ThumbRating)) {
            return false;
        }
        ThumbRating thumbRating = (ThumbRating) obj;
        return this.b == thumbRating.b && this.a == thumbRating.a;
    }

    public final int hashCode() {
        return uq2.b(Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ThumbRating: ");
        if (this.a) {
            str = "isThumbUp=" + this.b;
        } else {
            str = "unrated";
        }
        sb.append(str);
        return sb.toString();
    }
}

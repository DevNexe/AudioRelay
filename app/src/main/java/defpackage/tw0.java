package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class tw0 extends com5Fixed {
    public static final Parcelable.Creator<tw0> CREATOR = new c76();
    public final String w;

    @Deprecated
    public final int x;
    public final long y;

    public tw0(int i, long j, String str) {
        this.w = str;
        this.x = i;
        this.y = j;
    }

    public tw0(String str) {
        this.w = str;
        this.y = 1L;
        this.x = -1;
    }

    public final long b() {
        long j = this.y;
        return j == -1 ? this.x : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tw0) {
            tw0 tw0Var = (tw0) obj;
            String str = this.w;
            if (((str != null && str.equals(tw0Var.w)) || (str == null && tw0Var.w == null)) && b() == tw0Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.w, Long.valueOf(b())});
    }

    public final String toString() {
        tq2.QnHx qnHx = new tq2.QnHx(this);
        qnHx.a(this.w, MediationMetaData.KEY_NAME);
        qnHx.a(Long.valueOf(b()), MediationMetaData.KEY_VERSION);
        return qnHx.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.J(parcel, 1, this.w);
        Th.G(parcel, 2, this.x);
        Th.H(parcel, 3, b());
        Th.X(parcel, iP);
    }
}

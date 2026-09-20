package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class n15 extends com5Fixed {
    public static final Parcelable.Creator<n15> CREATOR = new fp5();
    public final int w;

    @Nullable
    public List<ge2> x;

    public n15(@Nullable List list, int i) {
        this.w = i;
        this.x = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, this.w);
        Th.N(parcel, 2, this.x);
        Th.X(parcel, iP);
    }
}

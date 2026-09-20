package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w1L {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public w1L(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1L)) {
            return false;
        }
        w1L w1l = (w1L) obj;
        return ur1.a(this.a, w1l.a) && ur1.a(this.b, w1l.b) && ur1.a(this.c, w1l.c) && ur1.a(this.d, w1l.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + bl2.a(this.c, bl2.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdUnitIds(mainAdmobBanner=");
        sb.append(this.a);
        sb.append(", adsFragmentAdmobNative=");
        sb.append(this.b);
        sb.append(", adsFragmentAdmobRectangle=");
        sb.append(this.c);
        sb.append(", endSessionInterstitialAdMob=");
        return i5.b(sb, this.d, ")");
    }
}

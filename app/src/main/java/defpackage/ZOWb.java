package defpackage;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class ZOWb {
    public final XmlPullParser a;
    public int b = 0;

    public ZOWb(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
    }

    public final float a(TypedArray typedArray, String str, int i, float f) {
        float fD = zb5.d(typedArray, this.a, str, i, f);
        c(typedArray.getChangingConfigurations());
        return fD;
    }

    public final String b(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        c(typedArray.getChangingConfigurations());
        return string;
    }

    public final void c(int i) {
        this.b = i | this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZOWb)) {
            return false;
        }
        ZOWb zOWb = (ZOWb) obj;
        return ur1.a(this.a, zOWb.a) && this.b == zOWb.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.a);
        sb.append(", config=");
        return qc0.a(sb, this.b, ')');
    }
}

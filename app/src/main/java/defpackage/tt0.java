package defpackage;

import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class tt0 implements pa3, i91 {
    public static ej1 w;
    public static final tt0 x = new tt0();

    public static final cg a(my myVar) {
        Shader shader = myVar.a;
        if ((shader != null) || myVar.c != 0) {
            return shader != null ? new eg(shader) : new jq4(hH.c(myVar.c));
        }
        return null;
    }

    @Override // defpackage.i91
    public Object apply(Object obj) {
        return new LpT7Fixed(mv4.P(((zs1) obj).a, new char[]{','}));
    }

    @Override // defpackage.pa3
    public boolean test(Object obj) {
        return ((y73) obj) instanceof y73.LPt8Fixed;
    }
}

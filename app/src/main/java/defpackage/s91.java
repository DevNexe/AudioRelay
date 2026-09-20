package defpackage;

import com.unity3d.scar.adapter.common.QnHx;

/* JADX INFO: loaded from: classes3.dex */
public final class s91 extends QnHx {
    public s91(Object... objArr) {
        super(t91.SCAR_NOT_PRESENT, null, objArr);
    }

    public static s91 a(z34 z34Var) {
        String str = String.format("Cannot show ad that is not loaded for placement %s", z34Var.a);
        return new s91(t91.AD_NOT_LOADED_ERROR, str, z34Var.a, z34Var.b, str);
    }

    public static s91 b(z34 z34Var) {
        String str = String.format("Missing queryInfoMetadata for ad %s", z34Var.a);
        return new s91(t91.QUERY_NOT_FOUND_ERROR, str, z34Var.a, z34Var.b, str);
    }

    @Override // com.unity3d.scar.adapter.common.QnHx
    public final String getDomain() {
        return "GMA";
    }

    public s91(t91 t91Var, String str, Object... objArr) {
        super(t91Var, str, objArr);
    }
}

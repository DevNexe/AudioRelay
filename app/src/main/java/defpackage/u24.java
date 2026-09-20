package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class u24 {
    public static final Class<? extends Object>[] f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final z24.CQf e;

    public static final class QnHx {
        public static u24 a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new u24();
                }
                HashMap map = new HashMap();
                for (String str : bundle2.keySet()) {
                    map.put(str, bundle2.get(str));
                }
                return new u24(map);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (!((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true)) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = parcelableArrayList.get(i);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
            }
            return new u24(linkedHashMap);
        }
    }

    public u24(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new uy(this, 1);
        linkedHashMap.putAll(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bundle a(u24 u24Var) {
        for (Map.Entry entry : t92.W(u24Var.b).entrySet()) {
            u24Var.b(((z24.CQf) entry.getValue()).a(), (String) entry.getKey());
        }
        LinkedHashMap linkedHashMap = u24Var.a;
        Set<String> setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        uy2 uy2Var = new uy2("keys", arrayList);
        uy2[] uy2VarArr = {uy2Var, new uy2("values", arrayList2)};
        Bundle bundle = new Bundle(2);
        for (int i = 0; i < 2; i++) {
            uy2 uy2Var2 = uy2VarArr[i];
            String str2 = (String) uy2Var2.w;
            Object obj = uy2Var2.x;
            if (obj == null) {
                bundle.putString(str2, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str2, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str2, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str2, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str2, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str2, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str2, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str2, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str2, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str2, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str2, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str2, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str2, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str2, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str2, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str2, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str2, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str2, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str2, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str2, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str2, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str2, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str2 + '\"');
                    }
                    bundle.putSerializable(str2, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str2, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                ji.a(bundle, str2, (IBinder) obj);
            } else if (obj instanceof Size) {
                ki.a(bundle, str2, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                }
                ki.b(bundle, str2, (SizeF) obj);
            }
        }
        return bundle;
    }

    public final void b(Object obj, String str) {
        boolean z;
        if (obj == null) {
            z = true;
            break;
        }
        Class<? extends Object>[] clsArr = f;
        z = false;
        for (int i = 0; i < 29; i++) {
            if (clsArr[i].isInstance(obj)) {
                z = true;
                break;
            }
        }
        if (!z) {
            throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
        }
        Object obj2 = this.c.get(str);
        fi2 fi2Var = obj2 instanceof fi2 ? (fi2) obj2 : null;
        if (fi2Var != null) {
            fi2Var.h(obj);
        } else {
            this.a.put(str, obj);
        }
        si2 si2Var = (si2) this.d.get(str);
        if (si2Var == null) {
            return;
        }
        si2Var.setValue(obj);
    }

    public u24() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new z24.CQf() { // from class: t24
            @Override // z24.CQf
            public final Bundle a() {
                return u24.a(this.a);
            }
        };
    }
}

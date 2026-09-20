package com.google.android.gms.internal.ads;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import defpackage.ko6;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public final class QX {
    public static final void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(ko6.e(zzgnf.zzx((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzgnf) {
            sb.append(": \"");
            sb.append(ko6.e((zzgnf) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzgon) {
            sb.append(" {");
            c((zzgon) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i4 = i + 2;
        a(sb, i4, SubscriberAttributeKt.JSON_NAME_KEY, entry.getKey());
        a(sb, i4, "value", entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    public static final String b(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static void c(zzgpx zzgpxVar, StringBuilder sb, int i) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zzgpxVar.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String strConcat = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1, strSubstring.length() - 4)));
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    a(sb, i, b(strConcat), zzgon.h(zzgpxVar, method2, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String strConcat2 = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1, strSubstring.length() - 3)));
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    a(sb, i, b(strConcat2), zzgon.h(zzgpxVar, method3, new Object[0]));
                }
            }
            if (((Method) map2.get("set".concat(strSubstring))) != null && (!strSubstring.endsWith("Bytes") || !map.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                String strConcat3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1)));
                Method method4 = (Method) map.get("get".concat(strSubstring));
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objH = zzgon.h(zzgpxVar, method4, new Object[0]);
                    if (method5 == null) {
                        if (objH instanceof Boolean) {
                            if (((Boolean) objH).booleanValue()) {
                                a(sb, i, b(strConcat3), objH);
                            }
                        } else if (objH instanceof Integer) {
                            if (((Integer) objH).intValue() != 0) {
                                a(sb, i, b(strConcat3), objH);
                            }
                        } else if (objH instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objH).floatValue()) != 0) {
                                a(sb, i, b(strConcat3), objH);
                            }
                        } else if (!(objH instanceof Double)) {
                            if (objH instanceof String) {
                                zEquals = objH.equals("");
                            } else if (objH instanceof zzgnf) {
                                zEquals = objH.equals(zzgnf.zzb);
                            } else if (objH instanceof zzgpx) {
                                if (objH != ((zzgpx) objH).zzbh()) {
                                    a(sb, i, b(strConcat3), objH);
                                }
                            } else if (!(objH instanceof Enum) || ((Enum) objH).ordinal() != 0) {
                                a(sb, i, b(strConcat3), objH);
                            }
                            if (!zEquals) {
                                a(sb, i, b(strConcat3), objH);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objH).doubleValue()) != 0) {
                            a(sb, i, b(strConcat3), objH);
                        }
                    } else if (((Boolean) zzgon.h(zzgpxVar, method5, new Object[0])).booleanValue()) {
                        a(sb, i, b(strConcat3), objH);
                    }
                }
            }
        }
        if (zzgpxVar instanceof zzgok) {
            throw null;
        }
        zzgri zzgriVar = ((zzgon) zzgpxVar).zzc;
        if (zzgriVar != null) {
            for (int i2 = 0; i2 < zzgriVar.a; i2++) {
                a(sb, i, String.valueOf(zzgriVar.b[i2] >>> 3), zzgriVar.c[i2]);
            }
        }
    }
}

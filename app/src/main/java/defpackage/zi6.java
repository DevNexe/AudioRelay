package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zi6 {
    public final String a;
    public final Bundle b;
    public Bundle c;
    public final /* synthetic */ xj6 d;

    public zi6(xj6 xj6Var) {
        this.d = xj6Var;
        oa3.e("default_event_parameters");
        this.a = "default_event_parameters";
        this.b = new Bundle();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    public final Bundle a() {
        byte b;
        if (this.c == null) {
            xj6 xj6Var = this.d;
            String string = xj6Var.i().getString(this.a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode == 115 && string3.equals("s")) {
                                        b = 0;
                                    } else {
                                        b = -1;
                                    }
                                } else if (string3.equals("l")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                            } else if (string3.equals("d")) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                            if (b == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (b == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (b != 2) {
                                bi6 bi6Var = xj6Var.a.i;
                                dq6.h(bi6Var);
                                bi6Var.f.c(string3, "Unrecognized persisted bundle type. Type");
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            bi6 bi6Var2 = xj6Var.a.i;
                            dq6.h(bi6Var2);
                            bi6Var2.f.b("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.c = bundle;
                } catch (JSONException unused2) {
                    bi6 bi6Var3 = xj6Var.a.i;
                    dq6.h(bi6Var3);
                    bi6Var3.f.b("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.c == null) {
                this.c = this.b;
            }
        }
        return this.c;
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        xj6 xj6Var = this.d;
        SharedPreferences.Editor editorEdit = xj6Var.i().edit();
        int size = bundle.size();
        String str = this.a;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            bi6 bi6Var = xj6Var.a.i;
                            dq6.h(bi6Var);
                            bi6Var.f.c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        bi6 bi6Var2 = xj6Var.a.i;
                        dq6.h(bi6Var2);
                        bi6Var2.f.c(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.c = bundle;
    }
}

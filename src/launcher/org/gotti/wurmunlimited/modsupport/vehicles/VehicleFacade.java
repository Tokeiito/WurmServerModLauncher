package org.gotti.wurmunlimited.modsupport.vehicles;

import com.wurmonline.server.behaviours.Seat;

public interface VehicleFacade {

	void setUnmountable(boolean b);

	void createOnlyPassengerSeats(int i);

	void setSeatFightMod(int i, float f, float g);

	void setCreature(boolean b);

	void setEmbarkString(String string);

	void setName(String name);

	void setMaxDepth(float f);

	void setMaxHeightDiff(float f);

	void setCommandType(byte i);

	void addHitchSeats(Seat[] hitches);
}



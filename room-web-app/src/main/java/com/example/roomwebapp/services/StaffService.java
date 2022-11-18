package com.example.roomwebapp.services;

import com.example.roomwebapp.models.Position;
import com.example.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {

    private static final List<StaffMember> staff = new ArrayList();

    static {
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Glory", "Odeyemi", Position.CONCIERGE));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Pelumi", "Ajuwon", Position.FRONT_DESK));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "John", "Doe", Position.SECURITY));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Jane", "Doe", Position.HOUSEKEEPING));
    }

    public List<StaffMember> getAllStaff(){
        return staff;
    }
}
